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

package com.io7m.jinterp.tests;

import com.io7m.jinterp.InterpolationD;
import com.io7m.jinterp.InterpolationFunctionDType;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("static-method") public final class InterpolationDTest
{

  @Test public void testCosine()
    throws Exception
  {
    Assert.assertEquals(
      InterpolationD.interpolateCosine(0.0f, 1.0f, 0.0f),
      0.0f,
      0.0f);
    Assert.assertEquals(
      InterpolationD.interpolateCosine(0.0f, 1.0f, 1.0f),
      1.0f,
      0.0f);
  }

  @Test public void testCosineFunction()
    throws Exception
  {
    final InterpolationFunctionDType f = InterpolationD.getCosine();
    Assert.assertEquals(f.call(0.0f, 1.0f, 0.0f), 0.0f, 0.0f);
    Assert.assertEquals(f.call(0.0f, 1.0f, 1.0f), 1.0f, 0.0f);
  }

  @Test public void testExponential()
    throws Exception
  {
    Assert.assertEquals(
      InterpolationD.interpolateExponential(0.0f, 1.0f, 0.0f),
      0.0f,
      0.0f);
    Assert.assertEquals(
      InterpolationD.interpolateExponential(0.0f, 1.0f, 1.0f),
      1.0f,
      0.0f);
  }

  @Test public void testExponentialFunction()
    throws Exception
  {
    final InterpolationFunctionDType f = InterpolationD.getExponential();
    Assert.assertEquals(f.call(0.0f, 1.0f, 0.0f), 0.0f, 0.0f);
    Assert.assertEquals(f.call(0.0f, 1.0f, 1.0f), 1.0f, 0.0f);
  }

  @Test public void testLinear()
    throws Exception
  {
    Assert.assertEquals(
      InterpolationD.interpolateLinear(0.0f, 1.0f, 0.0f),
      0.0f,
      0.0f);
    Assert.assertEquals(
      InterpolationD.interpolateLinear(0.0f, 1.0f, 1.0f),
      1.0f,
      0.0f);
  }

  @Test public void testLinearFunction()
    throws Exception
  {
    final InterpolationFunctionDType f = InterpolationD.getLinear();
    Assert.assertEquals(f.call(0.0f, 1.0f, 0.0f), 0.0f, 0.0f);
    Assert.assertEquals(f.call(0.0f, 1.0f, 1.0f), 1.0f, 0.0f);
  }

  @Test public void testLogarithmic()
    throws Exception
  {
    Assert.assertEquals(
      InterpolationD.interpolateLogarithmic(0.0f, 1.0f, 0.0f),
      0.0f,
      0.0f);
    Assert.assertEquals(
      InterpolationD.interpolateLogarithmic(0.0f, 1.0f, 1.0f),
      1.0f,
      0.0f);
  }

  @Test public void testLogarithmicFunction()
    throws Exception
  {
    final InterpolationFunctionDType f = InterpolationD.getLogarithmic();
    Assert.assertEquals(f.call(0.0f, 1.0f, 0.0f), 0.0f, 0.0f);
    Assert.assertEquals(f.call(0.0f, 1.0f, 1.0f), 1.0f, 0.0f);
  }
}
