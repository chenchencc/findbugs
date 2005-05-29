/*
 * Bytecode analysis framework
 * Copyright (C) 2005, University of Maryland
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package edu.umd.cs.findbugs.ba.npe;

import edu.umd.cs.findbugs.ba.JavaClassAndMethod;

public class NonNullSpecification {
	private final JavaClassAndMethod classAndMethod;
	private final NonNullParamProperty nonNullProperty;
	private final NonNullParamProperty possiblyNullProperty;

	public NonNullSpecification(JavaClassAndMethod classAndMethod, NonNullParamProperty nonParamProperty, NonNullParamProperty possiblyNullProperty) {
		this.classAndMethod = classAndMethod;
		this.nonNullProperty = nonParamProperty;
		this.possiblyNullProperty = possiblyNullProperty;
	}
	
	public JavaClassAndMethod getClassAndMethod() {
		return classAndMethod;
	}
	
	public NonNullParamProperty getNonNullProperty() {
		return nonNullProperty;
	}
	
	public NonNullParamProperty getPossiblyNullProperty() {
		return possiblyNullProperty;
	}
	
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append(classAndMethod);
		buf.append(":");
		if (!nonNullProperty.isEmpty()) {
			buf.append(" nonull=");
			buf.append(nonNullProperty);
		}
		if (!possiblyNullProperty.isEmpty()) {
			buf.append(" possiblynull=");
			buf.append(possiblyNullProperty);
		}
		return buf.toString();
	}
}
