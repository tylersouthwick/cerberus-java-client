# Cerberus Client

[ ![Download](https://api.bintray.com/packages/nike/maven/cerberus-client/images/download.svg) ](https://bintray.com/nike/maven/cerberus-client/_latestVersion)
[![][travis img]][travis]
[![Coverage Status](https://coveralls.io/repos/github/Nike-Inc/cerberus-java-client/badge.svg?branch=master)](https://coveralls.io/github/Nike-Inc/cerberus-java-client)
[![][license img]][license]

This is a Java based client library for Cerberus that is built on top of Nike's Cerberus client.

This library acts as a wrapper around the Nike developed Cerberus client by configuring the client to be Cerberus compatible.

To learn more about Cerberus, please see the [Cerberus website](http://engineering.nike.com/cerberus/).

## Quickstart for Cerberus Java Client

1. Add the [Cerberus client dependency](https://bintray.com/nike/maven/cerberus-client) to your build (e.g. Maven, Gradle).
1. Access secrets from Cerberus using Java.
``` java
    String cerberusUrl = "https://cerberus.example.com";
    String region = "us-west-2";
    CerberusClient cerberusClient = DefaultCerberusClientFactory.getClient(cerberusUrl, region);
    Map<String,String> secrets = cerberusClient.read("/app/my-sdb-name").getData();
```
Check out ["Working with AWS Credentials"](https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/credentials.html) for more information on how the AWS SDK for Java loads credentials.

## Development

### Run Integration Tests

First, make sure the following environment variables are set before running the Java Client integration tests:

``` bash
    export CERBERUS_ADDR=https://example.cerberus.com
    export TEST_REGION=us-west-2
```

Then, make sure AWS credentials have been obtained. One method is by running [gimme-aws-creds](https://github.com/Nike-Inc/gimme-aws-creds):

```bash
    gimme-aws-creds
```

Next, in the project directory run:
```gradle
    ./gradlew integration
```

<a name="license"></a>
## License

Cerberus client is released under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).

[travis]:https://travis-ci.org/Nike-Inc/cerberus-java-client
[travis img]:https://api.travis-ci.org/Nike-Inc/cerberus-java-client.svg?branch=master

[license]:LICENSE.txt
[license img]:https://img.shields.io/badge/License-Apache%202-blue.svg

[toc]:#table_of_contents
