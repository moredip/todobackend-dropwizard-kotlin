package com.todobackend.dropwizard_kotlin

import io.dropwizard.Configuration
import com.fasterxml.jackson.annotation.JsonProperty
import io.dropwizard.db.DataSourceFactory
import org.hibernate.validator.constraints.*
import java.net.URI
import javax.validation.constraints.*

class OurConfiguration : Configuration(){
    fun database():DataSourceFactory? {
        val dbUri = System.getenv("DATABASE_URL")?.let {URI(it)} ?: return null

        val (user,password) = dbUri.userInfo.split(":")
        val jdbcUrl = "jdbc:postgresql://${dbUri.host}:${dbUri.port}${dbUri.path}"

        val dsf = DataSourceFactory()
        dsf.driverClass = "org.postgresql.Driver"
        dsf.user = user
        dsf.password = password
        dsf.url = jdbcUrl

        return dsf
    }
}
