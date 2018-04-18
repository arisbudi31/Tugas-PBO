package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import java.util.*;
import models.sensorType;
public class Application extends Controller {
	@play.db.ebean.Transactional
    public static Result index() {
		List daftar = sensorType.findAll();
        return ok(index.render(daftar));
    }

}
