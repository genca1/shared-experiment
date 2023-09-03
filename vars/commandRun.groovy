def call(def command) {
    String ab = 'AAA';
    String af;

    echo "booom ${ab}";

    ab = 'BBBB';
    af = 'wewew';

    echo "changed to??? ${ab}"
    echo "assinged to??? ${af}"
    af = ab;
    echo "assinged or changed to??? ${af}"
    echo runner(command)
}