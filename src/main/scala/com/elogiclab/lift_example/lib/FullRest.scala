package com.elogiclab.lift_example {
package lib {



import net.liftweb.http.rest.RestHelper
/**
 * A full REST example
 */
object RestExample extends RestHelper {
  serve( {
    case "api" :: "user" :: id :: _ XmlGet _ => <b>ID: {id}</b>
  })
  
}

}}

