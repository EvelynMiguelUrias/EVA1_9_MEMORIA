/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_memoria;

/**
 *
 * @author Evelyn
 */
public class EVA1_9_MEMORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EVA1_9_MEMORIA pObj = new EVA1_9_MEMORIA();
       //PARA DESHACERSE DE LA MEMORIA DE UN OBJETO 
       pObj = null;//LIBERAMOS LA MEMORIA CREADA PARA EL OBJETO.
       //TODO OBJETO EN MEMORIA QUE NO ES REFERENCIADO POR ALGUNA VARIABLE EN EL
       //PROGRAMA, ES ELIMINADO POR EL GARBAGE COLLECTO 
       EVA1_9_MEMORIA pObj2 = new EVA1_9_MEMORIA();
       EVA1_9_MEMORIA pCopia = pObj2; //NO DUPLICAMOS EL OBJETO, DUPLICAMOS LA DIRECCION
       //QUEREMOS ELIMINAR pObj2
       pObj2 = null; //NO SE ELIMINA EL OBJETO, PORQUE COPIA SIGUE APUNTANDO
       pCopia = null; //AHORA SI, EL OBJETO SE ELIMINA, NO QUEDAN MAS REFERENCIAS AL OBJETO
       //CUANDO SE ELIMINA YA NO SE PUEDE RECUPERAR NADA DE ESTO 
    }
    
}
