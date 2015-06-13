/*
 * Copyright (C) 2015 Pavel Pscheidl
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cz.pscheidl.blog.javafxdi;

import com.google.inject.Guice;
import com.google.inject.Injector;
import cz.pscheidl.blog.javafxdi.guice.GuiceModule;
import java.io.IOException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Pavel Pscheidl
 */
public class JavaFXDI extends Application {

    public static void main(String[] args) {
        //Launch the application - public void start(Stage primaryStage) will be called next.
        JavaFXDI.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Injector injector = Guice.createInjector(new GuiceModule());
        //The FXMLLoader is instantiated the way Google Guice offers - the FXMLLoader instannce is built in a separated Provider<FXMLLoader> called FXMLLoaderProvider.
        FXMLLoader fxmlLoader = injector.getInstance(FXMLLoader.class);

        try (InputStream fxmlInputStream = ClassLoader.getSystemResourceAsStream("cz/pscheidl/blog/javafxdi/gui/JavaFXDI.fxml")) {
            Parent parent = fxmlLoader.load(fxmlInputStream);
            primaryStage.setScene(new Scene(parent));
            primaryStage.setTitle("JavaFX 8 Dependency injection");
            primaryStage.show();
            primaryStage.setOnCloseRequest(e -> {
                System.exit(0);
            });
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
