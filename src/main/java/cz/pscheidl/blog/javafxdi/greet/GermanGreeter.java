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
package cz.pscheidl.blog.javafxdi.greet;

/**
 *
 * @author Pavel Pscheidl
 */
public class GermanGreeter implements Greeter {

    @Override
    public String greet() {
        return "Hallo, Ich heiße Paul in Ich liebe JavaFX 8. Wie geht's ?";
    }

}
