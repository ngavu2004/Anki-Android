/*
 *  Copyright (c) 2023 David Allison <davidallisongithub@gmail.com>
 *
 *  This program is free software; you can redistribute it and/or modify it under
 *  the terms of the GNU General Public License as published by the Free Software
 *  Foundation; either version 3 of the License, or (at your option) any later
 *  version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT ANY
 *  WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 *  PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along with
 *  this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.ichi2.compat

import android.view.MotionEvent
import androidx.annotation.RequiresApi

@RequiresApi(34)
@Suppress("ktlint:standard:property-naming")
open class CompatV34 : CompatV33() {
    override val AXIS_GESTURE_X_OFFSET = MotionEvent.AXIS_GESTURE_X_OFFSET
    override val AXIS_GESTURE_Y_OFFSET = MotionEvent.AXIS_GESTURE_Y_OFFSET
    override val AXIS_GESTURE_SCROLL_X_DISTANCE = MotionEvent.AXIS_GESTURE_SCROLL_X_DISTANCE
    override val AXIS_GESTURE_SCROLL_Y_DISTANCE = MotionEvent.AXIS_GESTURE_SCROLL_Y_DISTANCE
    override val AXIS_GESTURE_PINCH_SCALE_FACTOR = MotionEvent.AXIS_GESTURE_PINCH_SCALE_FACTOR
}
