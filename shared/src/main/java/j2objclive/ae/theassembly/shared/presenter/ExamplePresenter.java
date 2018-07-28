package j2objclive.ae.theassembly.shared.presenter;

import j2objclive.ae.theassembly.shared.view.ExampleView;

public class ExamplePresenter {

    private ExampleView view;

    public ExamplePresenter(ExampleView view) {
        this.view = view;
    }

    public void onCreate() {
        view.setGreeting("Enter your name:");
    }

    public void handleClickGreetMe(String name) {
        if(name.endsWith("Trump")) {
            view.setGreeting("Please go away: " + name);
        }else {
            view.setGreeting("Hello : " + name);
        }

    }


}
