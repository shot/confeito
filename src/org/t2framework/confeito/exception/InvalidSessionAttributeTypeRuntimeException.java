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
package org.t2framework.confeito.exception;

/**
 * <#if locale="en">
 * <p>
 * InvalidSessionAttributeTypeRuntimeException throws when unexpected request is
 * failed injection to target parameter.
 * 
 * </p>
 * <#else>
 * <p>
 * 
 * </p>
 * </#if>
 * 
 * @author shot
 */
public class InvalidSessionAttributeTypeRuntimeException extends
		T2BaseRuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidSessionAttributeTypeRuntimeException(Class<?> param,
			Class<?> attr) {
		super("ETDT0016", param, attr);
	}
}