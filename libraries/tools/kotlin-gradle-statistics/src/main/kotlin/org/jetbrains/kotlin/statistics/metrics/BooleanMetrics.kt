/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.statistics.metrics

import org.jetbrains.kotlin.statistics.metrics.BooleanAnonymizationPolicy.*
import org.jetbrains.kotlin.statistics.metrics.BooleanOverridePolicy.*


enum class BooleanMetrics(val type: BooleanOverridePolicy, val anonymization: BooleanAnonymizationPolicy, val perProject: Boolean = false) {

    // whether the build is executed from IDE or from console
    EXECUTED_FROM_IDEA(OVERRIDE, SAFE),
    // Build script

    //annotation processors
    ENABLED_KAPT(OR, SAFE),
    ENABLED_DAGGER(OR, SAFE),
    ENABLED_DATABINDING(OR, SAFE),
    ENABLED_KOVER(OR, SAFE),

    ENABLED_COMPILER_PLUGIN_ALL_OPEN(OR, SAFE),
    ENABLED_COMPILER_PLUGIN_NO_ARG(OR, SAFE),
    ENABLED_COMPILER_PLUGIN_SAM_WITH_RECEIVER(OR, SAFE),
    ENABLED_COMPILER_PLUGIN_LOMBOK(OR, SAFE),
    ENABLED_COMPILER_PLUGIN_PARSELIZE(OR, SAFE),
    ENABLED_COMPILER_PLUGIN_ATOMICFU(OR, SAFE),
    ENABLED_COMPILER_PLUGIN_POWER_ASSERT(OR, SAFE),
    ENABLED_COMPILER_PLUGIN_KOTLINX_KOVER(OR, SAFE),
    ENABLED_COMPILER_PLUGIN_KOTLINX_SERIALIZATION(OR, SAFE),
    ENABLED_COMPILER_PLUGIN_KOTLINX_DOKKA(OR, SAFE),
    ENABLED_COMPILER_PLUGIN_KOTLINX_BINARY_COMPATIBILITY_VALIDATOR(OR, SAFE),

    ENABLED_HMPP(OR, SAFE),

    // Enabled features
    BUILD_SRC_EXISTS(OR, SAFE),
    BUILD_PREPARE_KOTLIN_BUILD_SCRIPT_MODEL(OR, SAFE),
    GRADLE_BUILD_CACHE_USED(OVERRIDE, SAFE),
    GRADLE_WORKER_API_USED(OVERRIDE, SAFE),
    GRADLE_CONFIGURATION_CACHE_ENABLED(OR, SAFE),
    GRADLE_PROJECT_ISOLATION_ENABLED(OR, SAFE),

    KOTLIN_OFFICIAL_CODESTYLE(OVERRIDE, SAFE),
    KOTLIN_PROGRESSIVE_MODE(OVERRIDE, SAFE),
    KOTLIN_KTS_USED(OR, SAFE),
    KOTLIN_INCREMENTAL_NATIVE_ENABLED(OR, SAFE),

    JS_GENERATE_EXTERNALS(OR, SAFE),

    JS_SOURCE_MAP(OR, SAFE),

    JS_IR_INCREMENTAL(OR, SAFE),

    WASM_IR_INCREMENTAL(OR, SAFE),

    //Garbage collector
    ENABLED_NOOP_GC(OR, SAFE),
    ENABLED_STWMS_GC(OR, SAFE),
    ENABLED_PMCS_GC(OR, SAFE),
    ENABLED_CMS_GC(OR, SAFE),

    //Build reports
    FILE_BUILD_REPORT(OR, SAFE),
    BUILD_SCAN_BUILD_REPORT(OR, SAFE),
    HTTP_BUILD_REPORT(OR, SAFE),
    SINGLE_FILE_BUILD_REPORT(OR, SAFE),
    JSON_BUILD_REPORT(OR, SAFE),

    //Dokka features
    ENABLED_DOKKA(OR, SAFE),
    ENABLED_DOKKA_HTML(OR, SAFE),
    ENABLED_DOKKA_JAVADOC(OR, SAFE),
    ENABLED_DOKKA_GFM(OR, SAFE),
    ENABLED_DOKKA_JEKYLL(OR, SAFE),
    ENABLED_DOKKA_HTML_MULTI_MODULE(OR, SAFE),
    ENABLED_DOKKA_GFM_MULTI_MODULE(OR, SAFE),
    ENABLED_DOKKA_JEKYLL_MULTI_MODULE(OR, SAFE),
    ENABLED_DOKKA_HTML_COLLECTOR(OR, SAFE),
    ENABLED_DOKKA_JAVADOC_COLLECTOR(OR, SAFE),
    ENABLED_DOKKA_GFM_COLLECTOR(OR, SAFE),
    ENABLED_DOKKA_JEKYLL_COLLECTOR(OR, SAFE),

    // User scenarios
    DEBUGGER_ENABLED(OVERRIDE, SAFE),
    COMPILATION_STARTED(OVERRIDE, SAFE),
    TESTS_EXECUTED(OVERRIDE, SAFE),
    MAVEN_PUBLISH_EXECUTED(OVERRIDE, SAFE),
    BUILD_FAILED(OVERRIDE, SAFE),
    KOTLIN_COMPILATION_FAILED(OR, SAFE),

    // Other plugins enabled
    KOTLIN_JS_PLUGIN_ENABLED(OR, SAFE),
    COCOAPODS_PLUGIN_ENABLED(OR, SAFE),
    KOTLINX_KOVER_GRADLE_PLUGIN_ENABLED(OR, SAFE),
    KOTLINX_SERIALIZATION_GRADLE_PLUGIN_ENABLED(OR, SAFE),
    KOTLINX_ATOMICFU_GRADLE_PLUGIN_ENABLED(OR, SAFE),
    KOTLINX_BINARY_COMPATIBILITY_GRADLE_PLUGIN_ENABLED(OR, SAFE),
    ;

    companion object {
        const val VERSION = 12
    }
}
