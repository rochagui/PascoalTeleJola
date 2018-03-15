package org.academiadecodigo.hexallents;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.io.InputStream;
import java.io.PrintStream;

public class MenuView implements View {

    private Prompt prompt;
    private MenuController menuController;

    public MenuView(InputStream input, PrintStream out, MenuController menuController) {
        this.menuController = menuController;
        prompt = new Prompt(input, out);
    }

    @Override
    public void show() {
        String[] options = {"Superbock", "CraftBeer"};
        MenuInputScanner menuInputScanner = new MenuInputScanner(options);
        menuInputScanner.setMessage("WELCOME TO TELEJOLA PASCOAL TELEDELIVERY WOW!\n Please make your order:");

        int answerIndex = prompt.getUserInput(menuInputScanner);

        menuController.mainMenu(answerIndex);
    }

    public Beer orderBeer(Beer askedBeer) {
        Courier courier = new Courier();
        return this.beer = courier.getBeer(askedBeer);
    }

    public int showPrice() {
        return orderBeer(this.beer).getStock();
    }
}
}
