/*
 * Copyright (C) 2018 Florian Dreier
 *
 * This file is part of MyTargets.
 *
 * MyTargets is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2
 * as published by the Free Software Foundation.
 *
 * MyTargets is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package de.dreier.mytargets.features.settings.backup

import de.dreier.mytargets.utils.Utils
import org.threeten.bp.LocalDate

data class BackupEntry(
    var fileId: String,

    /** Milliseconds since 1970 at UTC. */
    var lastModifiedAt: Long,
    private var backupSize: Long
) {
    val humanReadableSize: String
        get() = Utils.humanReadableByteCount(backupSize, true)
}
