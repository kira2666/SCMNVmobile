package ca.csf.dfc.projsynth.scmnv.exception;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Classe permettant de récuper le flux du système(Ex: System.err) et de faire soit un log ou de ne rien faire avec
 * @author Team 2014
 * @see FilterOutputStream 
 */
public class ErrorPipe extends FilterOutputStream
{
		/**
		 * Constructeur du tuyau de récupération
		 * @param p_outputStream Le outputStream
		 */
		public ErrorPipe(OutputStream p_outputStream)
		{
			super(p_outputStream);
		}
		
		/**
		 * Méthode permettant d'écrire dans le flux
		 * @see FilterOutputStream#write(byte[], int, int)
		 */
		@Override
		public void write(byte[] p_byteArray, int p_offset, int p_length) throws IOException
		{
			super.write(p_byteArray, p_offset, p_length);
		}	
}
