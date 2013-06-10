dataSource {
    pooled = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
        }
    }
    production {
       dataSource {
	        dbCreate = "update"
	        driverClassName = "org.postgresql.Driver"
	        dialect = org.hibernate.dialect.PostgreSQLDialect
	        uri = new URI("postgres://ylcqwrzyuphyzl:XPpuJQQYfmtbh2i2nAePaz2geq@ec2-107-20-215-249.compute-1.amazonaws.com:5432/d7elk1dhmlkvk7")
	
	        url = "jdbc:postgresql://"+uri.host+uri.path
	        username = uri.userInfo.split(":")[0]
	        password = uri.userInfo.split(":")[1]
	    }
	   
    }
}
