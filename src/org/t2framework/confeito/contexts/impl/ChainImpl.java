/*
 * Copyright 2008-2010 the T2 Project ant the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.t2framework.confeito.contexts.impl;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;

import org.t2framework.confeito.contexts.Chain;
import org.t2framework.confeito.contexts.WebContext;
import org.t2framework.confeito.util.Assertion;

/**
 * <#if locale="en">
 * <p>
 * Concrete class of Chain.
 * 
 * </p>
 * <#else>
 * <p>
 * 
 * </p>
 * </#if>
 * 
 * @author shot
 * 
 */
public class ChainImpl implements Chain {

	protected final FilterChain chain;

	public ChainImpl(final FilterChain chain) {
		this.chain = Assertion.notNull(chain);
	}

	@Override
	public void doFilter(WebContext context) throws IOException,
			ServletException {
		chain.doFilter(context.getRequest().getNativeResource(), context
				.getResponse().getNativeResource());
	}

}
