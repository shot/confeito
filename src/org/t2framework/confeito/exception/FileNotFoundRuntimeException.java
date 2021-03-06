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

import java.io.File;
import java.io.IOException;

/**
 * <#if locale="en">
 * <p>
 * {@link FileNotFoundRuntimeException} is an {@link RuntimeException} for not
 * found file.
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
public class FileNotFoundRuntimeException extends IORuntimeException {

	private static final long serialVersionUID = 1L;

	public FileNotFoundRuntimeException(IOException cause, File file) {
		super(cause, "ECMN0014", cause, file.getName());
	}

	public FileNotFoundRuntimeException(IOException cause, String path) {
		super(cause, "ECMN0014", cause, path);
	}

}
