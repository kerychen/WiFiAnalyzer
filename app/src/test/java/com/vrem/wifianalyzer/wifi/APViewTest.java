/*
 * WiFi Analyzer
 * Copyright (C) 2016  VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.vrem.wifianalyzer.wifi;

import com.vrem.wifianalyzer.R;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class APViewTest {
    @Test
    public void testAPViewNumber() throws Exception {
        assertEquals(2, APView.values().length);
    }

    @Test
    public void testFind() throws Exception {
        assertEquals(APView.FULL, APView.find(-1));
        assertEquals(APView.FULL, APView.find(APView.values().length));

        assertEquals(APView.FULL, APView.find(APView.FULL.ordinal()));
        assertEquals(APView.COMPACT, APView.find(APView.COMPACT.ordinal()));
    }

    @Test
    public void getLayout() throws Exception {
        assertEquals(R.layout.access_point_view_full, APView.FULL.getLayout());
        assertEquals(R.layout.access_point_view_compact, APView.COMPACT.getLayout());
    }

}