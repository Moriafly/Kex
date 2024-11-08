/**
 * Kex
 * Copyright (C) 2024 Moriafly
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

@file:Suppress("UNUSED")

package com.xuncorp.kex.util

import java.io.File

/**
 * Returns the platform-specific canonical path of this file
 *
 * The canonical path is an absolute path that has been normalized to remove any relative parts and symbolic links
 * This method ensures that the returned path is consistent across different platforms
 *
 * @return The canonical path of this file as a [String]
 */
val File.platformPath: String
    get() = canonicalPath

/**
 * Gets the common path of this file, ensuring that the path separator is always a forward slash ('/')
 *
 * This property is useful for creating paths that are consistent across different operating systems,
 * especially when working with file paths in a cross-platform environment
 *
 * @return The common path of this file as a [String], with all path separators replaced by forward slashes
 */
val File.commonPath: String
    get() = if (File.separatorChar != '/') canonicalPath.replace(File.separatorChar, '/') else canonicalPath