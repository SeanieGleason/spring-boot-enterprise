/*
 * Copyright 2022-2022 the original author or authors.
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

import com.enterprise.build.optional.OptionalDependenciesPlugin;
import com.enterprise.build.publish.PublishAllJavaComponentsPlugin;
import com.enterprise.build.publish.SpringPublishPlugin;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.plugins.JavaBasePlugin;

/**
 * Plugin to apply conventions to projects that are part of Spring Boot's build.
 * Conventions are applied in response to various plugins being applied.
 *
 * When the {@link JavaBasePlugin} is applied, the conventions in {@link JavaConventions}
 * are applied.
 *
 * @author Andy Wilkinson
 * @author Christoph Dreis
 * @author Mike Smithson
 * @author Sean Gleason
 */
public class ConventionsPlugin implements Plugin<Project> {

	@Override
	public void apply(final Project project) {

		new JavaConventions().apply(project);
		new SpringPublishPlugin().apply(project);
		new OptionalDependenciesPlugin().apply(project);
		new PublishAllJavaComponentsPlugin().apply(project);

	}

}