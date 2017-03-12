package clientrest

import grails.mongodb.*
import org.bson.types.ObjectId
import grails.rest.*

 @Resource(uri='/patient', formats=["json", "xml"])

class Patient implements MongoEntity<Patient> {
    
    
    ObjectId id
    String firstName
    String lastName
    int age
    
    static constraints = {
    }
}
