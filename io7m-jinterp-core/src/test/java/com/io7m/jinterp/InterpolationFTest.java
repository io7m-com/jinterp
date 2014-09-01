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

import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("static-method") public final class InterpolationFTest
{

  @Test public void testLogarithmic()
    throws Exception
  {
    Assert.assertEquals(
      InterpolationF.interpolateLogarithmic(0.0f, 1.0f, 0.0f),
      0.0f,
      0.0f);
    Assert.assertEquals(
      InterpolationF.interpolateLogarithmic(0.0f, 1.0f, 1.0f),
      1.0f,
      0.0f);
  }

  @Test public void testLogarithmicFunction()
    throws Exception
  {
    final InterpolationFunctionFType f = InterpolationF.getLogarithmic();
    Assert.assertEquals(f.call(0.0f, 1.0f, 0.0f), 0.0f, 0.0f);
    Assert.assertEquals(f.call(0.0f, 1.0f, 1.0f), 1.0f, 0.0f);
  }

  @Test public void testExponential()
    throws Exception
  {
    Assert.assertEquals(
      InterpolationF.interpolateExponential(0.0f, 1.0f, 0.0f),
      0.0f,
      0.0f);
    Assert.assertEquals(
      InterpolationF.interpolateExponential(0.0f, 1.0f, 1.0f),
      1.0f,
      0.0f);
  }

  @Test public void testExponentialFunction()
    throws Exception
  {
    final InterpolationFunctionFType f = InterpolationF.getExponential();
    Assert.assertEquals(f.call(0.0f, 1.0f, 0.0f), 0.0f, 0.0f);
    Assert.assertEquals(f.call(0.0f, 1.0f, 1.0f), 1.0f, 0.0f);
  }

  @Test public void testCosine()
    throws Exception
  {
    Assert.assertEquals(
      InterpolationF.interpolateCosine(0.0f, 1.0f, 0.0f),
      0.0f,
      0.0f);
    Assert.assertEquals(
      InterpolationF.interpolateCosine(0.0f, 1.0f, 1.0f),
      1.0f,
      0.0f);
  }

  @Test public void testCosineFunction()
    throws Exception
  {
    final InterpolationFunctionFType f = InterpolationF.getCosine();
    Assert.assertEquals(f.call(0.0f, 1.0f, 0.0f), 0.0f, 0.0f);
    Assert.assertEquals(f.call(0.0f, 1.0f, 1.0f), 1.0f, 0.0f);
  }

  @Test public void testLinear()
    throws Exception
  {
    Assert.assertEquals(
      InterpolationF.interpolateLinear(0.0f, 1.0f, 0.0f),
      0.0f,
      0.0f);
    Assert.assertEquals(
      InterpolationF.interpolateLinear(0.0f, 1.0f, 1.0f),
      1.0f,
      0.0f);
  }

  @Test public void testLinearFunction()
    throws Exception
  {
    final InterpolationFunctionFType f = InterpolationF.getLinear();
    Assert.assertEquals(f.call(0.0f, 1.0f, 0.0f), 0.0f, 0.0f);
    Assert.assertEquals(f.call(0.0f, 1.0f, 1.0f), 1.0f, 0.0f);
  }
}
