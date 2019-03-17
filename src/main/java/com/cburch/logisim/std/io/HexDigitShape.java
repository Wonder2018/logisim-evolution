/*******************************************************************************
 * This file is part of logisim-evolution.
 *
 *   logisim-evolution is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   logisim-evolution is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with logisim-evolution.  If not, see <http://www.gnu.org/licenses/>.
 *
 *   Original code by Carl Burch (http://www.cburch.com), 2011.
 *   Subsequent modifications by :
 *     + Haute École Spécialisée Bernoise
 *       http://www.bfh.ch
 *     + Haute École du paysage, d'ingénierie et d'architecture de Genève
 *       http://hepia.hesge.ch/
 *     + Haute École d'Ingénierie et de Gestion du Canton de Vaud
 *       http://www.heig-vd.ch/
 *   The project is currently maintained by :
 *     + REDS Institute - HEIG-VD
 *       Yverdon-les-Bains, Switzerland
 *       http://reds.heig-vd.ch
 *******************************************************************************/

package com.cburch.logisim.std.io;

import static com.cburch.logisim.std.Strings.S;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.cburch.logisim.instance.InstanceDataSingleton;
import com.cburch.logisim.circuit.CircuitState;
import com.cburch.logisim.circuit.appear.DynamicElement;
import com.cburch.logisim.data.Attribute;
import com.cburch.logisim.data.Bounds;
import com.cburch.logisim.util.UnmodifiableList;
import com.cburch.logisim.util.GraphicsUtil;
import com.cburch.draw.util.EditableLabel;

public class HexDigitShape extends SevenSegmentShape {

	public HexDigitShape(int x, int y, DynamicElement.Path p) {
		super(x, y, p);
	}

	@Override
	public Element toSvgElement(Document doc) {
		return toSvgElement(doc.createElement("visible-hexdigit"));
	}

	@Override
	public String getDisplayName() {
		return S.get("hexDigitComponent");
	}

	@Override
	public String toString() {
		return "Hex Digit:" + getBounds();
	}
}