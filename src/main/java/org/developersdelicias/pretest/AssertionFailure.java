package org.developersdelicias.pretest;

class AssertionFailure {

    private Console console = new Console();

    private AssertionFailure() {

    }

    AssertionFailure(Console console) {
        this.console = console;
    }

    public static void main(String[] args) {
        AssertionFailure failure = new AssertionFailure();
        failure.assertionError();
    }

    void assertionError() {
        try {
            assert false;
        } catch (RuntimeException re) {
            console.printLine("RuntimeException");
        } catch (Exception e) {
            console.printLine("Exception");
        } catch (Error e) {
            console.printLine("Error " + e);
        } catch (Throwable t) {
            console.printLine("Throwable");
        }
    }
}
