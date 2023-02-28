# omni-reporter-sbt-plugin

---

[![Twitter URL](https://img.shields.io/twitter/url?logoColor=blue&style=social&url=https%3A%2F%2Fimg.shields.io%2Ftwitter%2Furl%3Fstyle%3Dsocial)](https://twitter.com/intent/tweet?text=%20Checkout%20this%20%40github%20repo%20by%20%40joaofse%20%F0%9F%91%A8%F0%9F%8F%BD%E2%80%8D%F0%9F%92%BB%3A%20https%3A//github.com/jesperancinhaorg/omni-reporter-sbt-plugin)
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

[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-100/JEOrgLogo-27.png "João Esperancinha Homepage")](http://joaofilipesabinoesperancinha.nl)
[![](https://img.shields.io/badge/youtube-%230077B5.svg?style=for-the-badge&logo=youtube&color=FF0000)](https://www.youtube.com/@joaoesperancinha)
[![](https://img.shields.io/badge/Medium-12100E?style=for-the-badge&logo=medium&logoColor=white)](https://medium.com/@jofisaes)
[![](https://img.shields.io/badge/Buy%20Me%20A%20Coffee-%230077B5.svg?style=for-the-badge&logo=buymeacoffee&color=yellow)](https://www.buymeacoffee.com/jesperancinha)
[![](https://img.shields.io/badge/Twitter-%230077B5.svg?style=for-the-badge&logo=twitter&color=white)](https://twitter.com/joaofse)
[![](https://img.shields.io/badge/Mastodon-%230077B5.svg?style=for-the-badge&logo=mastodon&color=afd7f7)](https://masto.ai/@jesperancinha)
[![](https://img.shields.io/badge/Sessionize-%230077B5.svg?style=for-the-badge&logo=sessionize&color=cffff6)](https://sessionize.com/joao-esperancinha)
[![](https://img.shields.io/badge/Instagram-%230077B5.svg?style=for-the-badge&logo=instagram&color=purple)](https://www.instagram.com/joaofisaes)
[![](https://img.shields.io/badge/Tumblr-%230077B5.svg?style=for-the-badge&logo=tumblr&color=192841)](https://jofisaes.tumblr.com)
[![](https://img.shields.io/badge/Spotify-1ED760?style=for-the-badge&logo=spotify&logoColor=white)](https://open.spotify.com/user/jlnozkcomrxgsaip7yvffpqqm)
[![](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin)](https://www.linkedin.com/in/joaoesperancinha/)
[![](https://img.shields.io/badge/Xing-%230077B5.svg?style=for-the-badge&logo=xing&color=064e40)](https://www.xing.com/profile/Joao_Esperancinha/cv)
[![](https://img.shields.io/badge/YCombinator-%230077B5.svg?style=for-the-badge&logo=ycombinator&color=d0d9cd)](https://news.ycombinator.com/user?id=jesperancinha)
[![GitHub followers](https://img.shields.io/github/followers/jesperancinha.svg?label=Jesperancinha&style=social "GitHub")](https://github.com/jesperancinha)
[![](https://img.shields.io/badge/bitbucket-%230077B5.svg?style=for-the-badge&logo=bitbucket&color=blue)](https://bitbucket.org/jesperancinha)
[![](https://img.shields.io/badge/gitlab-%230077B5.svg?style=for-the-badge&logo=gitlab&color=orange)](https://gitlab.com/jesperancinha)
[![](https://img.shields.io/badge/Stack%20Overflow-%230077B5.svg?style=for-the-badge&logo=stackoverflow&color=5A5A5A)](https://stackoverflow.com/users/3702839/joao-esperancinha)
[![](https://img.shields.io/badge/Credly-%230077B5.svg?style=for-the-badge&logo=credly&color=4d2a00)](https://www.credly.com/users/joao-esperancinha)
[![](https://img.shields.io/badge/Coursera-%230077B5.svg?style=for-the-badge&logo=coursera&color=000080)](https://www.coursera.org/user/da3ff90299fa9297e283ee8e65364ffb)
[![](https://img.shields.io/badge/Docker-%230077B5.svg?style=for-the-badge&logo=docker&color=cyan)](https://hub.docker.com/u/jesperancinha)
[![](https://img.shields.io/badge/Reddit-%230077B5.svg?style=for-the-badge&logo=reddit&color=black)](https://www.reddit.com/user/jesperancinha/)
[![](https://img.shields.io/badge/Hackernoon-%230077B5.svg?style=for-the-badge&logo=hackernoon&color=0a5d00)](https://hackernoon.com/@jesperancinha)
[![](https://img.shields.io/badge/Code%20Project-%230077B5.svg?style=for-the-badge&logo=codeproject&color=063b00)](https://www.codeproject.com/Members/jesperancinha)
[![](https://img.shields.io/badge/Free%20Code%20Camp-%230077B5.svg?style=for-the-badge&logo=freecodecamp&color=0a5d00)](https://www.freecodecamp.org/jofisaes)
[![](https://img.shields.io/badge/Hackerrank-%230077B5.svg?style=for-the-badge&logo=hackerrank&color=1e2f97)](https://www.hackerrank.com/jofisaes)
[![](https://img.shields.io/badge/LeetCode-%230077B5.svg?style=for-the-badge&logo=leetcode&color=002647)](https://leetcode.com/jofisaes)
[![](https://img.shields.io/badge/Codewars-%230077B5.svg?style=for-the-badge&logo=codewars&color=722F37)](https://www.codewars.com/users/jesperancinha)
[![](https://img.shields.io/badge/CodePen-%230077B5.svg?style=for-the-badge&logo=codepen&color=black)](https://codepen.io/jesperancinha)
[![](https://img.shields.io/badge/HackerEarth-%230077B5.svg?style=for-the-badge&logo=hackerearth&color=00035b)](https://www.hackerearth.com/@jofisaes)
[![](https://img.shields.io/badge/Khan%20Academy-%230077B5.svg?style=for-the-badge&logo=khanacademy&color=00035b)](https://www.khanacademy.org/profile/jofisaes)
[![](https://img.shields.io/badge/Pinterest-%230077B5.svg?style=for-the-badge&logo=pinterest&color=FF0000)](https://nl.pinterest.com/jesperancinha)
[![](https://img.shields.io/badge/Quora-%230077B5.svg?style=for-the-badge&logo=quora&color=FF0000)](https://nl.quora.com/profile/Jo%C3%A3o-Esperancinha)
[![](https://img.shields.io/badge/Google%20Play-%230077B5.svg?style=for-the-badge&logo=googleplay&color=purple)](https://play.google.com/store/apps/developer?id=Joao+Filipe+Sabino+Esperancinha)
| [Sonatype Search Repos](https://search.maven.org/search?q=org.jesperancinha)
| [Dev.TO](https://dev.to/jofisaes)
| [Codebyte](https://coderbyte.com/profile/jesperancinha)
| [InfoQ](https://www.infoq.com/profile/Joao-Esperancinha.2/)
| [VMware Spring Professional 2021](https://www.credly.com/badges/762fa7a4-9cf4-417d-bd29-7e072d74cdb7)
| [Oracle Certified Professional, Java SE 11 Programmer](https://www.credly.com/badges/87609d8e-27c5-45c9-9e42-60a5e9283280)
| [Oracle Certified Professional, JEE7 Developer](https://www.credly.com/badges/27a14e06-f591-4105-91ca-8c3215ef39a2)
| [IBM Cybersecurity Analyst Professional](https://www.credly.com/badges/ad1f4abe-3dfa-4a8c-b3c7-bae4669ad8ce)
| [Certified Advanced JavaScript Developer](https://cancanit.com/certified/1462/)
| [Certified Neo4j Professional](https://graphacademy.neo4j.com/certificates/c279afd7c3988bd727f8b3acb44b87f7504f940aac952495ff827dbfcac024fb.pdf)
| [Deep Learning](https://www.credly.com/badges/8d27e38c-869d-4815-8df3-13762c642d64)
| [![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=JEsperancinhaOrg&color=yellow&style=for-the-badge "jesperancinha.org dependencies")](https://github.com/JEsperancinhaOrg)
[![Generic badge](https://img.shields.io/static/v1.svg?label=All%20Badges&message=Badges&color=red&style=for-the-badge "All badges")](https://joaofilipesabinoesperancinha.nl/badges)
[![Generic badge](https://img.shields.io/static/v1.svg?label=Status&message=Project%20Status&color=red&style=for-the-badge "Project statuses")](https://github.com/jesperancinha/project-signer/blob/master/project-signer-quality/Build.md)
