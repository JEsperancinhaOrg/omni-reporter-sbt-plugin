# omni-reporter-sbt-plugin

---

[![Twitter URL](https://img.shields.io/twitter/url?logoColor=blue&style=social&url=https%3A%2F%2Fimg.shields.io%2Ftwitter%2Furl%3Fstyle%3Dsocial)](https://twitter.com/intent/tweet?text=%20Checkout%20this%20%40github%20repo%20by%20%40joaofse%20%F0%9F%91%A8%F0%9F%8F%BD%E2%80%8D%F0%9F%92%BB%3A%20https%3A//github.com/jesperancinhaorg/omni-reporter-sbt-plugin)
[![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=omni-reporter-sbt-plugin&color=informational)](https://github.com/jesperancinhaorg/omni-reporter-sbt-plugin)

[![GitHub release](https://img.shields.io/github/release/JEsperancinhaOrg/omni-reporter-sbt-plugin.svg)](#)
[![Maven Central](https://img.shields.io/maven-central/v/org.jesperancinha.plugins/omni-reporter-sbt-plugin)](https://mvnrepository.com/artifact/org.jesperancinha.plugins/omni-reporter-sbt-plugin)

[//]: # ([![Sonatype Nexus]&#40;https://img.shields.io/nexus/r/https/oss.sonatype.org/org.jesperancinha.plugins/omni-reporter-sbt-plugin.svg&#41;]&#40;https://search.maven.org/artifact/org.jesperancinha.plugins/omni-reporter-sbt-plugin&#41;)

[![GitHub License](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](https://www.apache.org/licenses/LICENSE-2.0)

[![Codacy Badge](https://app.codacy.com/project/badge/Grade/773c3f06818347cca24c0332e6ce8da3)](https://www.codacy.com/gh/JEsperancinhaOrg/omni-reporter-scala-plugin/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=JEsperancinhaOrg/omni-reporter-scala-plugin&amp;utm_campaign=Badge_Grade)

[![Codacy Badge](https://app.codacy.com/project/badge/Coverage/773c3f06818347cca24c0332e6ce8da3)](https://www.codacy.com/gh/JEsperancinhaOrg/omni-reporter-scala-plugin/dashboard?utm_source=github.com&utm_medium=referral&utm_content=JEsperancinhaOrg/omni-reporter-scala-plugin&utm_campaign=Badge_Coverage)
[![Coverage Status](https://coveralls.io/repos/github/JEsperancinhaOrg/omni-reporter-sbt-plugin/badge.svg)](https://coveralls.io/github/JEsperancinhaOrg/omni-reporter-sbt-plugin)
[![codecov](https://codecov.io/gh/JEsperancinhaOrg/omni-reporter-sbt-plugin/branch/main/graph/badge.svg?token=oyrlsnGqGu)](https://codecov.io/gh/JEsperancinhaOrg/omni-reporter-sbt-plugin)

[![GitHub language count](https://img.shields.io/github/languages/count/jesperancinhaorg/omni-reporter-sbt-plugin.svg)](#)
[![GitHub top language](https://img.shields.io/github/languages/top/jesperancinhaorg/omni-reporter-sbt-plugin.svg)](#)
[![GitHub top language](https://img.shields.io/github/languages/code-size/jesperancinhaorg/omni-reporter-sbt-plugin.svg)](#)

---

## Introduction

This project is under contruction and it is intended to be used as a plugin for Scala projects.
At the moment it preserves a shape of a compile plugin. It does not work yet.

Please check document [ReleaseNotes.md](./ReleaseNotes.md) to keep up-to-date on the changes of this project

## Publish Local

```shell
sbt publishM2
```

## Release

File at ` ~/.sbt/sonatype_credentials` as described in [Using Sonatype](https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html):

```properties
realm=Sonatype Nexus Repository Manager
host=oss.sonatype.org
user=<USER>
password=<PASSWORD>
```

Check [plugin configuration](./project/plugins.sbt) for more details.

## References

- [Using Sonatype](https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html)
- [Write & test your own scala SBT plugin…](https://medium.com/@phkadam2008/write-test-your-own-scala-sbt-plugin-6701b0e36a62)
- [scala-compiler-plugin-template](https://github.com/softwaremill/scala-compiler-plugin-template)
- [string mask plugin](https://github.com/mkubala/stringmask/tree/scalac-plugin)