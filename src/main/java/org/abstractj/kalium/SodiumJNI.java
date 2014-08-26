/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.abstractj.kalium;

public class SodiumJNI {
  public final static native String sodium_version_string();
  public final static native int crypto_aead_chacha20poly1305_encrypt(byte[] jarg1, int[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5, int jarg6, byte[] jarg7, byte[] jarg8, byte[] jarg9);
  public final static native int crypto_aead_chacha20poly1305_decrypt(byte[] jarg1, int[] jarg2, byte[] jarg3, byte[] jarg4, int jarg5, byte[] jarg6, int jarg7, byte[] jarg8, byte[] jarg9);
  public final static native int crypto_hash_sha256(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_hash_sha512(byte[] jarg1, byte[] jarg2, int jarg3);
  public final static native int crypto_generichash_blake2b(byte[] jarg1, long jarg2, byte[] jarg3, int jarg4, byte[] jarg5, long jarg6);
  public final static native int crypto_box_curve25519xsalsa20poly1305_keypair(byte[] jarg1, byte[] jarg2);
  public final static native void randombytes(byte[] jarg1, int jarg2);
  public final static native int crypto_box_curve25519xsalsa20poly1305(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_box_curve25519xsalsa20poly1305_open(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_scalarmult_curve25519(byte[] jarg1, byte[] jarg2, byte[] jarg3);
  public final static native int crypto_secretbox_xsalsa20poly1305(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_secretbox_xsalsa20poly1305_open(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_sign_ed25519_seed_keypair(byte[] jarg1, byte[] jarg2, byte[] jarg3);
  public final static native int crypto_sign_ed25519(byte[] jarg1, int[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5);
  public final static native int crypto_sign_ed25519_open(byte[] jarg1, int[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5);
  public final static native int crypto_box_keypair(byte[] jarg1, byte[] jarg2);
  public final static native void randombytes_buf(long jarg1, long jarg2);
  public final static native int crypto_scalarmult_base(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_scalarmult(byte[] jarg1, byte[] jarg2, byte[] jarg3);
  public final static native int crypto_sign(byte[] jarg1, int[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5);
  public final static native int crypto_sign_open(byte[] jarg1, int[] jarg2, byte[] jarg3, int jarg4, byte[] jarg5);
  public final static native int crypto_secretbox(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_secretbox_open(byte[] jarg1, byte[] jarg2, int jarg3, byte[] jarg4, byte[] jarg5);
  public final static native String sodium_bin2hex(String jarg1, long jarg2, byte[] jarg3, long jarg4);
  public final static native int sodium_hex2bin(byte[] jarg1, long jarg2, String jarg3, long jarg4, String jarg5, long jarg6, long jarg7);
}
