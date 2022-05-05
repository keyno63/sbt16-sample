# sbt16-sample

sbt-1.6 の試しをしたかった

## Usage
### set up

Use version below.
- Java17+
- Scala3

### build

```shell
sbt compile
```

### test

```shell
sbt test
```

### format

format code, sbt files by using scalafmt.

```shell
sbt "all scalafmtSbt scalafmt test:scalafmt"
```

## LICENSE

This repository is MIT License.  
see [License](./LICENSE) file.
