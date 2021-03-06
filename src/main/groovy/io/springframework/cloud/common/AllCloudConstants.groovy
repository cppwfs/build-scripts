package io.springframework.cloud.common

import groovy.transform.CompileStatic

/**
 * Constants used by all cloud jobs (sometimes traits can't easily pass const values)
 *
 * @author Marcin Grzejszczak
 */
@CompileStatic
class AllCloudConstants {
	/**
	 * Latest version of Boot to be checked. Used in some E2E test (e.g. Camden vs latest Boot)
	 * and in compatibility builds
	 */
	public static final String DEFAULT_BOOT_VERSION = '1.5.0.BUILD-SNAPSHOT'
}
