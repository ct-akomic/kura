/*******************************************************************************
 * Copyright (c) 2011, 2016 Eurotech and/or its affiliates
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.25 at 06:05:15 PM CET 
//


package org.eclipse.kura.core.configuration.metatype;



/**
 * <p>Java class for Tscalar.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Tscalar">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="String"/>
 *     &lt;enumeration value="Long"/>
 *     &lt;enumeration value="Double"/>
 *     &lt;enumeration value="Float"/>
 *     &lt;enumeration value="Integer"/>
 *     &lt;enumeration value="Byte"/>
 *     &lt;enumeration value="Char"/>
 *     &lt;enumeration value="Boolean"/>
 *     &lt;enumeration value="Short"/>
 *     &lt;enumeration value="Password"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
public enum Tscalar 
{
    STRING("String"),
    LONG("Long"),
    DOUBLE("Double"),
    FLOAT("Float"),
    INTEGER("Integer"),
    BYTE("Byte"),
    CHAR("Char"),
    BOOLEAN("Boolean"),
    SHORT("Short"),
    PASSWORD("Password");
    private final String value;

    Tscalar(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Tscalar fromValue(String v) {
        for (Tscalar c: Tscalar.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
