/*
 * Copyright © 2014 <code@io7m.com> http://io7m.com
 * 
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.io7m.jinterp;

import com.io7m.junreachable.UnreachableCodeException;

/**
 * Interpolation functions.
 */

public final class InterpolationF
{
  /**
   * @return An interpolation function based on
   *         {@link #interpolateCosine(float, float, float)}.
   */

  public static InterpolationFunctionFType getCosine()
  {
    return InterpolationF::interpolateCosine;
  }

  /**
   * @return An interpolation function based on
   *         {@link #interpolateExponential(float, float, float)}.
   */

  public static InterpolationFunctionFType getExponential()
  {
    return InterpolationF::interpolateExponential;
  }

  /**
   * @return An interpolation function based on
   *         {@link #interpolateLinear(float, float, float)}.
   */

  public static InterpolationFunctionFType getLinear()
  {
    return InterpolationF::interpolateLinear;
  }

  /**
   * @return An interpolation function based on
   *         {@link #interpolateLogarithmic(float, float, float)}.
   */

  public static InterpolationFunctionFType getLogarithmic()
  {
    return InterpolationF::interpolateLogarithmic;
  }

  /**
   * <p>
   * Interpolate between <tt>x0</tt> and <tt>x1</tt> based on <tt>a</tt> such
   * that:
   * </p>
   *
   * <pre>
   * interpolateCosine (x0, x1, 1.0) == x1
   * interpolateCosine (x0, x1, 0.0) == x0
   * </pre>
   *
   * @param x0
   *          The start value
   * @param x1
   *          The end value
   * @param a
   *          The interpolation factor in the range <tt>[0.0, 1.0]</tt>
   * @return A value between <tt>[x0, x1]</tt>.
   */

  public static float interpolateCosine(
    final float x0,
    final float x1,
    final float a)
  {
    final float ft = (float) (a * Math.PI);
    final float f = (float) ((1 - Math.cos(ft)) * 0.5f);
    return (x0 * (1 - f)) + (x1 * f);
  }

  /**
   * Interpolate between {@code x0} and {@code x1} based on
   * {@code factor}, using an exponential scale. When
   * {@code factor == 0}, the function returns {@code x0}, when
   * {@code factor == 1}, the function returns {@code x1}. More
   * formally, the function returns {@code x0 + (factor² * (x1 - x0))} .
   *
   * @param factor
   *          The interpolation factor in the range <tt>[0.0, 1.0]</tt>
   * @param x0
   *          The lower bound.
   * @param x1
   *          The upper bound.
   * @return A value between <tt>[x0, x1]</tt>.
   */

  public static float interpolateExponential(
    final float x0,
    final float x1,
    final float factor)
  {
    return InterpolationF.interpolateLinear(x0, x1, factor * factor);
  }

  /**
   * <p>
   * Linearly interpolate between <tt>x0</tt> and <tt>x1</tt> based on
   * <tt>a</tt> such that:
   * </p>
   *
   * <pre>
   * interpolateLinear (x0, x1, 1.0) == x1
   * interpolateLinear (x0, x1, 0.0) == x0
   * </pre>
   *
   * @param x0
   *          The start value
   * @param x1
   *          The end value
   * @param a
   *          The interpolation factor in the range <tt>[0.0, 1.0]</tt>
   * @return A value between <tt>[x0, x1]</tt>.
   */

  public static float interpolateLinear(
    final float x0,
    final float x1,
    final float a)
  {
    return (x0 * (1 - a)) + (x1 * a);
  }

  /**
   * Interpolate between {@code x0} and {@code x1} based on
   * {@code factor}, using an exponential scale. When
   * {@code factor == 0}, the function returns {@code x0}, when
   * {@code factor == 1}, the function returns {@code x1}. More
   * formally, the function returns
   * {@code x0 + (sqrt(factor) * (x1 - x0))} .
   *
   * @param factor
   *          The interpolation factor in the range <tt>[0.0, 1.0]</tt>
   * @param x0
   *          The lower bound.
   * @param x1
   *          The upper bound.
   * @return A value between <tt>[x0, x1]</tt>.
   */

  public static float interpolateLogarithmic(
    final float x0,
    final float x1,
    final float factor)
  {
    return InterpolationF
      .interpolateLinear(x0, x1, (float) Math.sqrt(factor));
  }

  private InterpolationF()
  {
    throw new UnreachableCodeException();
  }
}
