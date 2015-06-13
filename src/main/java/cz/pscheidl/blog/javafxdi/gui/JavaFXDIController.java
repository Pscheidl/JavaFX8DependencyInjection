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
package cz.pscheidl.blog.javafxdi.gui;

import cz.pscheidl.blog.javafxdi.greet.Greeter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javax.inject.Inject;

/**
 *
 * @author Pavel Pscheidl
 */
public class JavaFXDIController implements Initializable {

    @FXML private Label text;
    @Inject private Greeter greeter;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        text.setText(greeter.greet());

    }

}
