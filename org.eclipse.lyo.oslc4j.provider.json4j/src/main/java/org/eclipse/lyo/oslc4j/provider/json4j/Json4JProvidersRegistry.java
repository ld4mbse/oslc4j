/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *	
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *	   Russell Boykin		- initial API and implementation
 *	   Alberto Giammaria	- initial API and implementation
 *	   Chris Peters			- initial API and implementation
 *	   Gianluca Bernardini	- initial API and implementation
 *******************************************************************************/
package org.eclipse.lyo.oslc4j.provider.json4j;

import java.util.HashSet;
import java.util.Set;
import org.eclipse.lyo.oslc4j.provider.jsonld4j.OslcRdfJsonLDArrayProvider;
import org.eclipse.lyo.oslc4j.provider.jsonld4j.OslcRdfJsonLDCollectionProvider;
import org.eclipse.lyo.oslc4j.provider.jsonld4j.OslcRdfJsonLDProvider;

public final class Json4JProvidersRegistry
{
	private static final Set<Class<?>> PROVIDERS = new HashSet<Class<?>>();

	static
	{
		PROVIDERS.add(OslcCompactJsonProvider.class);
		PROVIDERS.add(OslcRdfJsonArrayProvider.class);
		PROVIDERS.add(OslcRdfJsonCollectionProvider.class);
		PROVIDERS.add(OslcRdfJsonProvider.class);
		PROVIDERS.add(OslcRdfJsonLDArrayProvider.class);
		PROVIDERS.add(OslcRdfJsonLDCollectionProvider.class);
		PROVIDERS.add(OslcRdfJsonLDProvider.class);
	}

	private Json4JProvidersRegistry()
	{
		super();
	}

	/**
	 * Returns a mutable set of provider classes.  Each request returns a new Set.
	 */
	public static final Set<Class<?>> getProviders()
	{
		return new HashSet<Class<?>>(PROVIDERS);
	}
}
