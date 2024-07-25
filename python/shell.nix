{ pkgs ? import <nixpkgs> { } }:
pkgs.mkShell {
  buildInputs = [
    pkgs.python312
    pkgs.pypy3
    pkgs.python312Packages.numpy
    pkgs.python312Packages.cython
    pkgs.python312Packages.pytest
    pkgs.python312Packages.setuptools
    pkgs.stdenv.cc.cc.lib
  ];

  shellHook = ''
    export PYTHONPATH=$(pwd)/quicksort_cython:$PYTHONPATH
    export PYTHONPATH=$(pwd)/quicksort:$PYTHONPATH
  '';
}
