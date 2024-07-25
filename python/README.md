# Python Example

## Python Interpreter

```bash
mkdir venv && python3 -m venv venv && source venv/bin/activate # Enter Venv
pip install -r requirements.txt # Install dependencies
pytest # Test
python main.py # Run
```

## Pypy (JIT)

```bash
mkdir venv && python3 -m venv venv && source venv/bin/activate # Enter Venv
pip install -r requirements.txt # Install dependencies
pytest # Test
pypy main.py # Run
```

## Cython

```bash
mkdir venv && python3 -m venv venv && source venv/bin/activate # Enter Venv
pip install -r requirements.txt # Install dependencies
python setup.py build_ext --inplace # Build
python main_cython.py # Run
```

## Using Nix

```bash
nix-shell # Enter nix-shell
pytest
python main.py # Run
# Or run Cython
python setup.py build_ext --inplace # Build
python main_cython.py # Run
```