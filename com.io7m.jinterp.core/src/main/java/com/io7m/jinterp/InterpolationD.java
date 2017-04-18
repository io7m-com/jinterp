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

public final class InterpolationD
{
  /**
   * @return An interpolation function based on
   *         {@link #interpolateCosine(double, double, double)}.
   */

  public static InterpolationFunctionDType getCosine()
  {
    return new InterpolationFunctionDType() {
      @Override public double call(
        final double x0,
        final double x1,
        final double factor)
      {
        return InterpolationD.interpolateCosine(x0, x1, factor);
      }
    };
  }

  /**
   * @return An interpolation function based on
   *         {@link #interpolateExponential(double, double, double)}.
   */

  public static InterpolationFunctionDType getExponential()
  {
    return new InterpolationFunctionDType() {
      @Override public double call(
        final double x0,
        final double x1,
        final double factor)
      {
        return InterpolationD.interpolateExponential(x0, x1, factor);
      }
    };
  }

  /**
   * @return An interpolation function based on
   *         {@link #interpolateLinear(double, double, double)}.
   */

  public static InterpolationFunctionDType getLinear()
  {
    return new InterpolationFunctionDType() {
      @Override public double call(
        final double x0,
        final double x1,
        final double factor)
      {
        return InterpolationD.interpolateLinear(x0, x1, factor);
      }
    };
  }

  /**
   * @return An interpolation function based on
   *         {@link #interpolateLogarithmic(double, double, double)}.
   */

  public static InterpolationFunctionDType getLogarithmic()
  {
    return new InterpolationFunctionDType() {
      @Override public double call(
        final double x0,
        final double x1,
        final double factor)
      {
        return InterpolationD.interpolateLogarithmic(x0, x1, factor);
      }
    };
  }

  /**
   * <p>
   * Interpolate between <tt>x0</tt> and <tt>x1</tt> based on <tt>factor</tt>
   * such that:
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
   * @param factor
   *          The interpolation factor
   * @return A value between <tt>[x0, x1]</tt>.
   */

  public static double interpolateCosine(
    final double x0,
    final double x1,
    final double factor)
  {
    final double ft = factor * Math.PI;
    final double f = (1 - Math.cos(ft)) * 0.5f;
    return (x0 * (1 - f)) + (x1 * f);
  }

  /**
   * Interpolate between <code>x0</code> and <code>x1</code> based on
   * <code>factor</code>, using an exponential scale. When
   * <code>factor == 0</code>, the function returns <code>x0</code>, when
   * <code>factor == 1</code>, the function returns <code>x1</code>. More
   * formally, the function returns <code>x0 + (factor² * (x1 - x0))</code> .
   *
   * @param factor
   *          The interpolation factor in the range <tt>[0.0, 1.0]</tt>
   * @param x0
   *          The lower bound.
   * @param x1
   *          The upper bound.
   * @return A value between <tt>[x0, x1]</tt>.
   */

  public static double interpolateExponential(
    final double x0,
    final double x1,
    final double factor)
  {
    return InterpolationD.interpolateLinear(x0, x1, factor * factor);
  }

  /**
   * <p>
   * Linearly interpolate between <tt>x0</tt> and <tt>x1</tt> based on
   * <tt>factor</tt> such that:
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
   * @param factor
   *          The interpolation factor
   * @return A value between <tt>[x0, x1]</tt>.
   */

  public static double interpolateLinear(
    final double x0,
    final double x1,
    final double factor)
  {
    return (x0 * (1 - factor)) + (x1 * factor);
  }

  /**
   * Interpolate between <code>x0</code> and <code>x1</code> based on
   * <code>factor</code>, using an exponential scale. When
   * <code>factor == 0</code>, the function returns <code>x0</code>, when
   * <code>factor == 1</code>, the function returns <code>x1</code>. More
   * formally, the function returns
   * <code>x0 + (sqrt(factor) * (x1 - x0))</code> .
   *
   * @param factor
   *          The interpolation factor in the range <tt>[0.0, 1.0]</tt>
   * @param x0
   *          The lower bound.
   * @param x1
   *          The upper bound.
   * @return A value between <tt>[x0, x1]</tt>.
   */

  public static double interpolateLogarithmic(
    final double x0,
    final double x1,
    final double factor)
  {
    return InterpolationD.interpolateLinear(x0, x1, Math.sqrt(factor));
  }

  private InterpolationD()
  {
    throw new UnreachableCodeException();
  }
}
