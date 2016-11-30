# camel-exceptions-core
A core set of Java exceptions and marker interfaces for use with Apache Camel.

Releases are hosted over at [bintray](https://bintray.com/capgeminiuk/maven/camel-exceptions-core/view) licenced under Apache v.2.0.

![Build Status](https://travis-ci.org/andrewharmellaw/camel-exceptions-core.svg?branch=master)

It's recommended when you're handling exceptions in Apache Camel that you differentiate between recoverable and irrecoverable exceptions.  The classes provided here encapsulate this, and can be subclassed as required.

Examples of frequently-used subclasses which we have found useful can be found in the separate [camel-exceptions-data](https://github.com/andrewharmellaw/camel-exceptions-data), [camel-exceptions-db](https://github.com/andrewharmellaw/camel-exceptions-db), and [camel-exceptions-rest](https://github.com/andrewharmellaw/camel-exceptions-rest) projects.
