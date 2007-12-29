/*
 * (C) Copyright 2002-2008 Diomidis Spinellis
 * (C) Copyright 2008 Abstratt Technologies
 *
 * Permission to use, copy, and distribute this software and its
 * documentation for any purpose and without fee is hereby granted,
 * provided that the above copyright notice appear in all copies and that
 * both that copyright notice and this permission notice appear in
 * supporting documentation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND WITHOUT ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, WITHOUT LIMITATION, THE IMPLIED WARRANTIES OF
 * MERCHANTIBILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 *
 * $Id$
 *
 */
package org.umlgraph.engine.options;

/**
 * Constants for class diagram options.
 */
public interface ClassDiagramOptions {
    /**
     * Produce fully-qualified class names (boolean).
     */
    String QUALIFIED_NAMES = "classDiagramQualifiedNames";

    /**
     * When using qualified class names, put the package name in the line after the class name, in order to reduce the width of class nodes.
     */
    String POSTFIX_QUALIFIED_NAMES = "classDiagramPostfixQualifiedNames";
    
    /**
     * Try to automatically infer dependencies between classes by inspecting operation and attribute types. See the class diagram inference chapter for more details. Disabled by default. (boolean) 
     */
    String INFER_DEPENDENCY = "classDiagramInferDependency";
    
    /**
     * Try to automatically infer association relationships between classes by inspecting attribute types. See the class diagram inference chapter for further details. Disabled by default. (boolean)
     */
    String INFER_ASSOCIATIONS = "classDiagramInferUsage";
    
    /**
     * The type of relationship inferred when -inferrel is activated. Defaults to "navassoc" (see the class modelling chapter for a list of relationship types). (String)
     */
    String INFER_ASSOCIATION_TYPE = "classDiagramInferAssociationType";

    /**
     * Specifies the lowest visibility level of elements used to infer dependencies among classes. Possible values are private, package, protected, public, in this order. The default value is private. Use higher levels to limit the number of inferred dependencies. (String) 
     */
    String INFER_DEPENDENCY_VISIBILITY = "classDiagramInferDependencyVisibility";  
}
