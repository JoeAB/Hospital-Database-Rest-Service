package clientrest
import grails.rest.*
import grails.converters.*

class PatientController extends RestfulController {
    static responseFormats = ['json', 'xml']
    PatientController(){
        super(Patient)
    }
    
    @Override
    def delete(){
        respond(['Not allowed'])     
    }
   
    def searchFName(String q, Integer max ) { 
       if(q) {
            def query = Patient.where { 
            firstName ==~ ~/$q/
            }
            respond query.list(max: Math.min( max ?: 10, 100)) 
        }
        else {
            respond([]) 
        }
    }
    
    def searchLName(String q, Integer max ) { 
        if(q) {
            def query = Patient.where { 
            lastName ==~ ~/$q/
            }
            respond query.list(max: Math.min( max ?: 10, 100)) 
        }
        else {
            respond([]) 
        }
    }
    
   
}

