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

/**
 * The type of interpolation functions.
 */

public interface InterpolationFunctionFType
{
  /**
   * <p>
   * Interpolate between {@code x0} and {@code x1} based on {@code a} such
   * that:
   * </p>
   *
   * <pre>
   * call (x0, x1, 1.0) == x1
   * call (x0, x1, 0.0) == x0
   * </pre>
   *
   * @param x0
   *          The start value
   * @param x1
   *          The end value
   * @param a
   *          The interpolation amount
   * @return A value between {@code [x0, x1]}.
   */

  float call(
    float x0,
    float x1,
    float a);
}
