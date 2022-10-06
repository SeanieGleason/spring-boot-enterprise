/*
 * Copyright 2012-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.enterprise.build;

/**
 * Sets the Project links used in the Maven Repository Plugin.
 * @author Sean Gleason
 */
public enum ProjectLinks {

	/**
	 * Homepage of the Project.
	 */
	HOMEPAGE("https://github.com/gleasonsean/spring-boot-enterprise"),

	/**
	 * Issues page for the Project.
	 */
	ISSUES("https://github.com/gleasonsean/spring-boot-enterprise/issues"),

	/**
	 * Source Control Management page for the project.
	 */
	SCM_URL("https://github.com/gleasonsean/spring-boot-enterprise"),

	/**
	 * Source Control Management Git link for the project.
	 */
	SCM_CONNECTION("https://github.com/gleasonsean/spring-boot-enterprise.git"),

	/**
	 * Source Control Management Development Git Link for the project.
	 */
	SCM_DEV_CONNECTION("git@github.com:gleasonsean/spring-boot-enterprise.git");

	private final String link;

	ProjectLinks(String link) {
		this.link = link;
	}

	public String link() {
		return this.link;
	}

}
