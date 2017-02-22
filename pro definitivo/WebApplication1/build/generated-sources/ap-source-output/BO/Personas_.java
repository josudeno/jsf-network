package BO;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-05-18T21:34:05")
@StaticMetamodel(Personas_.class)
public class Personas_ { 

    public static volatile SingularAttribute<Personas_, String> nombre;
    public static volatile SingularAttribute<Personas_, String> apellido;
    public static volatile SingularAttribute<Personas_, Date> fechanac;
    public static volatile SingularAttribute<Personas_, Character> sexo;
    public static volatile SingularAttribute<Personas_, Integer> idPersona;

}