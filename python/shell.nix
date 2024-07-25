{ pkgs ? import <nixpkgs> { } }:
pkgs.mkShell {
  buildInputs = [
    pkgs.python311
    pkgs.python311Packages.numpy
    pkgs.python311Packages.cython
    pkgs.stdenv.cc.cc.lib
  ];

  shellHook = ''
    export PYTHONPATH=$(pwd)/quicksort_cython:$PYTHONPATH
    export PYTHONPATH=$(pwd)/quicksort:$PYTHONPATH
  '';
}
