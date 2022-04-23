### Assignment OpenRefine (v3.5.0)

+ Architecture
+ Quality Attribute
    + Item B 1
    + Item B 2
    + Item B 3
+ Design pattern
    * Sigleton
        * SQLiteConnectionManager.java : https://github.com/OpenRefine/OpenRefine/blob/3.5.0/extensions/database/src/com/google/refine/extension/database/sqlite/SQLiteConnectionManager.java
        * SQLiteDatabaseService.java : https://github.com/OpenRefine/OpenRefine/blob/3.5.0/extensions/database/src/com/google/refine/extension/database/sqlite/SQLiteDatabaseService.java
    * Template Method
        * ProjectManager.java : https://github.com/OpenRefine/OpenRefine/blob/3.5.0/main/src/com/google/refine/ProjectManager.java
        * ProjectManagerStub.java : https://github.com/OpenRefine/OpenRefine/blob/3.5.0/main/tests/server/src/com/google/refine/ProjectManagerStub.java
        * FileProjectManager.java : https://github.com/OpenRefine/OpenRefine/blob/3.5.0/main/src/com/google/refine/io/FileProjectManager.java
    * Visitor
        * RowVisitor.java : https://github.com/OpenRefine/OpenRefine/blob/3.5.0/main/src/com/google/refine/browsing/RowVisitor.java
        * ExpressionNumericValueBinner.java : https://github.com/OpenRefine/OpenRefine/blob/3.5.0/main/src/com/google/refine/browsing/util/ExpressionNumericValueBinner.java
        * FilteredRows.java : https://github.com/OpenRefine/OpenRefine/blob/3.5.0/main/src/com/google/refine/browsing/FilteredRows.java
        * ConjunctiveFilteredRows.java : https://github.com/OpenRefine/OpenRefine/blob/3.5.0/main/src/com/google/refine/browsing/util/ConjunctiveFilteredRows.java
        * FilteredRecordsAsFilteredRows.java : https://github.com/OpenRefine/OpenRefine/blob/3.5.0/main/src/com/google/refine/browsing/util/FilteredRecordsAsFilteredRows.java
        * RangeFacet.java : https://github.com/OpenRefine/OpenRefine/blob/3.5.0/main/src/com/google/refine/browsing/facets/RangeFacet.java
    
----
Source code : https://github.com/OpenRefine/OpenRefine/releases/tag/3.5.0
