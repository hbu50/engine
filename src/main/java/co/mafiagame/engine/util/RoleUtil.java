/*
 *  Copyright (C) 2015 mafiagame.ir
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package co.mafiagame.engine.util;

import co.mafiagame.common.domain.result.Message;
import co.mafiagame.engine.domain.Role;

/**
 * @author Esa Hekmatizadeh
 */
public class RoleUtil {
    public static String roleIs(Role role){
        switch (role) {
            case CITIZEN:
                return "your.role.is.citizen";
            case MAFIA:
                return "your.role.is.mafia";
            case DETECTOR:
                return "your.role.is.detector";
            case DOCTOR:
                return "your.role.is.doctor";
        }
        throw new IllegalArgumentException("role not found");
    }
}
