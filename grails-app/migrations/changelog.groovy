databaseChangeLog = {

	changeSet(author: "yousefabed (generated)", id: "1370883493579-1") {
		createTable(tableName: "ANSWER") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_7")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "ANSWER_TEXT", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "DATE_ANSWERED", type: "TIMESTAMP") {
				constraints(nullable: "false")
			}

			column(name: "GROUP_ID", type: "INT") {
				constraints(nullable: "false")
			}

			column(name: "QUESTION_ID", type: "INT") {
				constraints(nullable: "false")
			}

			column(name: "STUDENT_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "yousefabed (generated)", id: "1370883493579-2") {
		createTable(tableName: "PERSISTENT_SESSION") {
			column(name: "ID", type: "VARCHAR(255)") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_3")
			}

			column(name: "CREATION_TIME", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "INVALIDATED", type: "BOOLEAN") {
				constraints(nullable: "false")
			}

			column(name: "LAST_ACCESSED_TIME", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "MAX_INACTIVE_INTERVAL", type: "INT") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "yousefabed (generated)", id: "1370883493579-3") {
		createTable(tableName: "PERSISTENT_SESSION_ATTRIBUTE") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_F")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "NAME", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "SESSION_ID", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "yousefabed (generated)", id: "1370883493579-4") {
		createTable(tableName: "PERSISTENT_SESSION_ATTRIBUTE_VALUE") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_5")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "ATTRIBUTE_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "SERIALIZED", type: "VARBINARY(20000)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "yousefabed (generated)", id: "1370883493579-5") {
		createTable(tableName: "STUDENT") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_B")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "AGE", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "GENDER", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "GRADE", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "NAME", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "yousefabed (generated)", id: "1370883493579-6") {
		addForeignKeyConstraint(baseColumnNames: "STUDENT_ID", baseTableName: "ANSWER", baseTableSchemaName: "PUBLIC", constraintName: "FKABCA3FBE3983D821", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", onUpdate: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "STUDENT", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "yousefabed (generated)", id: "1370883493579-7") {
		addForeignKeyConstraint(baseColumnNames: "SESSION_ID", baseTableName: "PERSISTENT_SESSION_ATTRIBUTE", baseTableSchemaName: "PUBLIC", constraintName: "FK50C6048B92381D29", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", onUpdate: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "PERSISTENT_SESSION", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "yousefabed (generated)", id: "1370883493579-8") {
		addForeignKeyConstraint(baseColumnNames: "ATTRIBUTE_ID", baseTableName: "PERSISTENT_SESSION_ATTRIBUTE_VALUE", baseTableSchemaName: "PUBLIC", constraintName: "FK1EFE24BDF830ABF5", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", onUpdate: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "PERSISTENT_SESSION_ATTRIBUTE", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}
}
