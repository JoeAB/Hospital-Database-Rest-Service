package clientrest

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/patients"(resources:"patient") {
            collection {
                '/searchFName'(controller:'patient', action:'searchFName')
                '/searchLName'(controller:'patient', action:'searchLName')

           }

        }
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
