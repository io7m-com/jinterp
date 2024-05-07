jinterp
===

[![Maven Central](https://img.shields.io/maven-central/v/com.io7m.jinterp/com.io7m.jinterp.svg?style=flat-square)](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.io7m.jinterp%22)
[![Maven Central (snapshot)](https://img.shields.io/nexus/s/com.io7m.jinterp/com.io7m.jinterp?server=https%3A%2F%2Fs01.oss.sonatype.org&style=flat-square)](https://s01.oss.sonatype.org/content/repositories/snapshots/com/io7m/jinterp/)
[![Codecov](https://img.shields.io/codecov/c/github/io7m-com/jinterp.svg?style=flat-square)](https://codecov.io/gh/io7m-com/jinterp)
![Java Version](https://img.shields.io/badge/21-java?label=java&color=007fff)

![com.io7m.jinterp](./src/site/resources/jinterp.jpg?raw=true)

| JVM | Platform | Status |
|-----|----------|--------|
| OpenJDK (Temurin) Current | Linux | [![Build (OpenJDK (Temurin) Current, Linux)](https://img.shields.io/github/actions/workflow/status/io7m-com/jinterp/main.linux.temurin.current.yml)](https://www.github.com/io7m-com/jinterp/actions?query=workflow%3Amain.linux.temurin.current)|
| OpenJDK (Temurin) LTS | Linux | [![Build (OpenJDK (Temurin) LTS, Linux)](https://img.shields.io/github/actions/workflow/status/io7m-com/jinterp/main.linux.temurin.lts.yml)](https://www.github.com/io7m-com/jinterp/actions?query=workflow%3Amain.linux.temurin.lts)|
| OpenJDK (Temurin) Current | Windows | [![Build (OpenJDK (Temurin) Current, Windows)](https://img.shields.io/github/actions/workflow/status/io7m-com/jinterp/main.windows.temurin.current.yml)](https://www.github.com/io7m-com/jinterp/actions?query=workflow%3Amain.windows.temurin.current)|
| OpenJDK (Temurin) LTS | Windows | [![Build (OpenJDK (Temurin) LTS, Windows)](https://img.shields.io/github/actions/workflow/status/io7m-com/jinterp/main.windows.temurin.lts.yml)](https://www.github.com/io7m-com/jinterp/actions?query=workflow%3Amain.windows.temurin.lts)|

## jinterp

Trivial Java functions to interpolate values.

## Features

* Linear interpolation.
* Cosine interpolation.
* Exponential interpolation.
* Log interpolation.
* High coverage test suite.
* [OSGi-ready](https://www.osgi.org/)
* [JPMS-ready](https://en.wikipedia.org/wiki/Java_Platform_Module_System)
* ISC license.

## Usage

```
final double r = InterpolationD.interpolateLinear(0.0, 10.0, 0.5)
assert r == 5.0
```

