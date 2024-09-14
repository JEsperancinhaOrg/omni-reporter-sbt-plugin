# omni-reporter-sbt-plugin

---


[![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=omni-reporter-sbt-plugin&color=informational)](https://github.com/jesperancinhaorg/omni-reporter-sbt-plugin)

[![GitHub release](https://img.shields.io/github/release/JEsperancinhaOrg/omni-reporter-sbt-plugin.svg)](#)
[![Scala version support](https://index.scala-lang.org/jesperancinhaorg/omni-reporter-sbt-plugin/omni-reporter-sbt-plugin/latest-by-scala-version.svg?platform=sbt1.0)](https://index.scala-lang.org/jesperancinhaorg/omni-reporter-sbt-plugin/omni-reporter-sbt-plugin)

[![GitHub License](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](https://www.apache.org/licenses/LICENSE-2.0)

[![Snyk Score](https://snyk-widget.herokuapp.com/badge/mvn/org.jesperancinha.plugins/omni-reporter-sbt-plugin/badge.svg)](https://github.com/JEsperancinhaOrg/omni-reporter-sbt-plugin)

[![omni-reporter-sbt-plugin](https://github.com/JEsperancinhaOrg/omni-reporter-sbt-plugin/actions/workflows/omni-reporter-sbt-plugin.yml/badge.svg)](https://github.com/JEsperancinhaOrg/omni-reporter-sbt-plugin/actions/workflows/omni-reporter-sbt-plugin.yml)

[![Codacy Badge](https://app.codacy.com/project/badge/Grade/773c3f06818347cca24c0332e6ce8da3)](https://www.codacy.com/gh/JEsperancinhaOrg/omni-reporter-scala-plugin/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=JEsperancinhaOrg/omni-reporter-scala-plugin&amp;utm_campaign=Badge_Grade)
[![codebeat badge](https://codebeat.co/badges/7dbc50fe-1e97-44bb-8130-09afd2912009)](https://codebeat.co/projects/github-com-jesperancinhaorg-omni-reporter-sbt-plugin-main)
[![BCH compliance](https://bettercodehub.com/edge/badge/JEsperancinhaOrg/omni-reporter-sbt-plugin?branch=main)](https://bettercodehub.com/results/JEsperancinhaOrg/omni-reporter-sbt-plugin)

[![Codacy Badge](https://app.codacy.com/project/badge/Coverage/773c3f06818347cca24c0332e6ce8da3)](https://www.codacy.com/gh/JEsperancinhaOrg/omni-reporter-scala-plugin/dashboard?utm_source=github.com&utm_medium=referral&utm_content=JEsperancinhaOrg/omni-reporter-scala-plugin&utm_campaign=Badge_Coverage)
[![Coverage Status](https://coveralls.io/repos/github/JEsperancinhaOrg/omni-reporter-sbt-plugin/badge.svg)](https://coveralls.io/github/JEsperancinhaOrg/omni-reporter-sbt-plugin)
[![codecov](https://codecov.io/gh/JEsperancinhaOrg/omni-reporter-sbt-plugin/branch/main/graph/badge.svg?token=oyrlsnGqGu)](https://codecov.io/gh/JEsperancinhaOrg/omni-reporter-sbt-plugin)

[![GitHub language count](https://img.shields.io/github/languages/count/jesperancinhaorg/omni-reporter-sbt-plugin.svg)](#)
[![GitHub top language](https://img.shields.io/github/languages/top/jesperancinhaorg/omni-reporter-sbt-plugin.svg)](#)
[![GitHub top language](https://img.shields.io/github/languages/code-size/jesperancinhaorg/omni-reporter-sbt-plugin.svg)](#)

---

## Introduction

This version works pretty much like all JVM programmed Omni Reporter plugins. In this case, it also uses a JSON configuration just like the lein plugin.
Have a look at the documentation on the maven plugin for further details and checkout the other plugins of the Omni family:

| [![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=omni-coveragereporter-maven-plugin&color=informational)](https://github.com/JEsperancinhaOrg/omni-reporter-maven-plugin)                                                                                                                                                                                                 |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=omni-coveragereporter-gradle-plugin&color=informational)](https://github.com/JEsperancinhaOrg/omni-reporter-gradle-plugin) [![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=omni-coveragereporter-lein&color=informational)](https://github.com/jesperancinhaorg/omni-coveragereporter-lein)  |


Also from the Omni family here are a few others that belong to different runtimes:

[![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=omni-coveragereporter-python&color=informational)](https://github.com/JEsperancinhaOrg/omni-coveragereporter-python)


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

See examples of the usage of this plugin on these projects:

-   [![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=math-service-scala%20🧮&color=informational)](https://github.com/jesperancinha/math-service-scala) - Simple usage
-   [![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=Image%20Train%20Filters%20Services%20🚂&color=informational)](https://github.com/jesperancinha/image-train-filters-scala) - Multi-module with extra sources and reports from different technologies (NodeJS and SBT-Scala)

## References

-   [Using Sonatype](https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html)
-   [Write & test your own scala SBT plugin…](https://medium.com/@phkadam2008/write-test-your-own-scala-sbt-plugin-6701b0e36a62)
-   [scala-compiler-plugin-template](https://github.com/softwaremill/scala-compiler-plugin-template)
-   [string mask plugin](https://github.com/mkubala/stringmask/tree/scalac-plugin)

## About me

[![GitHub followers](https://img.shields.io/github/followers/jesperancinha.svg?label=Jesperancinha&style=for-the-badge&logo=github&color=grey "GitHub")](https://github.com/jesperancinha)
