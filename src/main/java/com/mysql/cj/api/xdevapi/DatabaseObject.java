/*
  Copyright (c) 2015, 2017, Oracle and/or its affiliates. All rights reserved.

  The MySQL Connector/J is licensed under the terms of the GPLv2
  <http://www.gnu.org/licenses/old-licenses/gpl-2.0.html>, like most MySQL Connectors.
  There are special exceptions to the terms and conditions of the GPLv2 as it is applied to
  this software, see the FOSS License Exception
  <http://www.mysql.com/about/legal/licensing/foss-exception.html>.

  This program is free software; you can redistribute it and/or modify it under the terms
  of the GNU General Public License as published by the Free Software Foundation; version 2
  of the License.

  This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
  See the GNU General Public License for more details.

  You should have received a copy of the GNU General Public License along with this
  program; if not, write to the Free Software Foundation, Inc., 51 Franklin St, Fifth
  Floor, Boston, MA 02110-1301  USA

 */

package com.mysql.cj.api.xdevapi;

/**
 * A client-side representation of X Plugin server object, e.g. table, collection, etc.
 */
public interface DatabaseObject {

    /**
     * Type of database objects.
     */
    enum DbObjectType {
        COLLECTION, TABLE, VIEW, COLLECTION_VIEW
    };

    /**
     * Existence states of database objects.
     */
    enum DbObjectStatus {
        EXISTS, NOT_EXISTS, UNKNOWN
    };

    /**
     * Retrieve the session owning the given schema object.
     */
    BaseSession getSession();

    /**
     * Retrieve the schema owning this database object.
     */
    Schema getSchema();

    /**
     * Retrieve the name of the database object represented by the Java object.
     */
    String getName();

    /**
     * Query the existence of this database object.
     */
    DbObjectStatus existsInDatabase();
}