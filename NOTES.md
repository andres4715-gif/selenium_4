## Tipos de Datos Primitivos en Java

```text
byte.
short.
int.
long.
float.
double.
boolean.
char.
```

## Para darle una mirada a las listas: 
* [Listas](http://panamahitek.com/el-uso-de-listas-en-java/)

## Que es una clase abstracta y la diferencia con una interface: 
* You can check this [video](https://www.youtube.com/watch?v=Id3kTuEPB_s)
```text
* Es una clase padre donde unicamente se colocan la estructura de una abstracción, esto 
es para dejar que las clases hijas sean las que agregan los detalles.

* Una clase abstracta es una clase identica a una clase normal pero al menos debe tener
un metodo abstracto

* Puede tener constructores, Atributos, Metodos ETC,  
```
## Que es un metodo abstracto: 
```text
* Es un metodo vacio (Sin cuerpo) por ende no realiza ninguna acción. 
* La utilidad es definir que se debe hacer pero no como. 
```

## Que es una interface: 
```text
* Es una colección de metodos abstractos en las que se especifica que se 
debe hacer pero no el como se debe hacer ya que son las clases hijas las 
que definan el comportamiento. 

* No puede hacer nada por si sola y es practicamente un contrato y las
clases que heredan son las que definen el comportamiento de todos los 
metodos abstractos. 

-- Ejemplo: 

public interface Canino
{
    public abstract void aullar(); 
    public abstract void ladrar(); 
}
```

# Para solucioner el tema de la herencia multiple
## NOTA: Java solo puede heredar de una sola clase: 

```text
* Con la condicion que ya tenemos la clase abstracta con al menos una metodo abstracto declarado.
* Teniendo en cuenta que solo se puede heredar de una clase, se crean las interfaces como un comtrato
- Luego en la clase donde se va a inplementar se extiende de la clase abstracta y se 
implementa la interface 

- Ejemplo: 

public class Perro extends Mascota implements Canino {
    @Override 
    public void aullar() {
        <// codigo a ejecutar>
    }
    
    @Override 
    public void ladrar() {
        <// codigo a ejecutar>
    }
}
```

## Encapsulamiento: 
### Modificadores de acceso: 
```text
- Public: acceso al atrubuto o al metodo desde cualquier otra clase del proyecto.

- Protected: acceso desde la misma clase, acceso desde el mismo paquete y de las 
clases que hereden de ella.

- Private: Solo se puede acceder desde la misma clase, para obtener el acceso a los 
metodos se debe hacer con los metodos Get() and Set() ya que estos deben ser 
metodos publicos y estos se usan para obtener el valor de un atributo desde fuera
de la clase. 

```







