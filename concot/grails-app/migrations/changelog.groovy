databaseChangeLog = {

	changeSet(author: "lourenco.cunha (generated)", id: "1503278570946-1") {
		createTable(tableName: "CATEGORIA") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_3")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "NOME", type: "VARCHAR(128)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "lourenco.cunha (generated)", id: "1503278570946-2") {
		createTable(tableName: "COTACAO") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_6")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "DATA", type: "TIMESTAMP") {
				constraints(nullable: "false")
			}

			column(name: "FORNECEDOR_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "ITEM_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "MOEDA_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "VALOR", type: "DECIMAL(19,2)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "lourenco.cunha (generated)", id: "1503278570946-3") {
		createTable(tableName: "FORNECEDOR") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_6B")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "NOME", type: "VARCHAR(128)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "lourenco.cunha (generated)", id: "1503278570946-4") {
		createTable(tableName: "ITEM") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_2")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "CATEGORIA_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "NOME", type: "VARCHAR(128)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "lourenco.cunha (generated)", id: "1503278570946-5") {
		createTable(tableName: "MOEDA") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_4")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "NOME", type: "VARCHAR(64)") {
				constraints(nullable: "false")
			}

			column(name: "SIMBOLO", type: "VARCHAR(4)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "lourenco.cunha (generated)", id: "1503278570946-10") {
		createIndex(indexName: "UK_PRX5ELPV558AH8PK8X18U56YC_INDEX_3", tableName: "CATEGORIA", unique: "true") {
			column(name: "NOME")
		}
	}

	changeSet(author: "lourenco.cunha (generated)", id: "1503278570946-11") {
		createIndex(indexName: "UK_1167HFQ9WD9WRB34O9PDGGOX9_INDEX_6", tableName: "FORNECEDOR", unique: "true") {
			column(name: "NOME")
		}
	}

	changeSet(author: "lourenco.cunha (generated)", id: "1503278570946-12") {
		createIndex(indexName: "UK_L26EELW9Q97DDCI02Q3W0H3BG_INDEX_4", tableName: "MOEDA", unique: "true") {
			column(name: "SIMBOLO")
		}
	}

	changeSet(author: "lourenco.cunha (generated)", id: "1503278570946-6") {
		addForeignKeyConstraint(baseColumnNames: "FORNECEDOR_ID", baseTableName: "COTACAO", baseTableSchemaName: "PUBLIC", constraintName: "FK_TI5XOC89JVNFJBKBHBAHDX9OS", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", onUpdate: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "FORNECEDOR", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "lourenco.cunha (generated)", id: "1503278570946-7") {
		addForeignKeyConstraint(baseColumnNames: "ITEM_ID", baseTableName: "COTACAO", baseTableSchemaName: "PUBLIC", constraintName: "FK_M6SIJB79K67I61378RH2FRSEP", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", onUpdate: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "ITEM", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "lourenco.cunha (generated)", id: "1503278570946-8") {
		addForeignKeyConstraint(baseColumnNames: "MOEDA_ID", baseTableName: "COTACAO", baseTableSchemaName: "PUBLIC", constraintName: "FK_7GY0IWNJX1HGQOFPXYD4AF5N6", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", onUpdate: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "MOEDA", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "lourenco.cunha (generated)", id: "1503278570946-9") {
		addForeignKeyConstraint(baseColumnNames: "CATEGORIA_ID", baseTableName: "ITEM", baseTableSchemaName: "PUBLIC", constraintName: "FK_SKTSQ2M5BMVBRYCQFYS62Y7X5", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", onUpdate: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "CATEGORIA", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}
}
