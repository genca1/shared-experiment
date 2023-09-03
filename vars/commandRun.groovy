def call(def command) {
    String ab = 'AAA';

    echo "booom ${ab}";

    ab = 'BBBB';

    echo "changed to??? ${ab}"
    echo runner(command)
}